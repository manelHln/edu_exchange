import React, { useState } from "react";
import { Input } from "./ui/input";
import { Button } from "./ui/button";
import { useToast } from "./ui/use-toast";
import axios from "axios";
import { useSession } from "next-auth/react";

const ReportForm = ({ userId, postId }) => {
  const { toast } = useToast();
  const [reason, setReason] = useState("");
  const { data: session, status } = useSession({ required: true });

  const handleSendReport = (e) => {
    const data = {
      reason: reason,
      reporterId: userId,
      postId: postId,
    };
    axios
      .post(`/posts/${postId}/reports`, data, {
        headers: { Authorization: session.accessToken },
      })
      .then((response) => {
        toast({
          title: "Great!",
          description: "Your report has been sent successfully!",
        });
      })
      .catch((error) => {
        toast({
          title: "Oops, something went wrong",
          description: error.message,
          variant: "destructive",
        });
      });
  };

  return (
    <div className="grid gap-4">
      <div className="space-y-2">
        <h4 className="font-medium leading-none">Report</h4>
        <p className="text-sm text-muted-foreground">Report post to admin</p>
      </div>
      <div className="grid gap-2">
        <div className="grid items-center gap-4">
          <Input
            id="width"
            value={reason}
            className="col-span-2 h-8"
            name="reason"
            onChange={(e) => setReason(e.target.value)}
          />
        </div>
        <Button
          size="icon"
          className="flex justify-center items-center gap-2 rounded-sm px-10"
          onClick={handleSendReport}
        >
          Done
        </Button>
      </div>
    </div>
  );
};

export default ReportForm;
