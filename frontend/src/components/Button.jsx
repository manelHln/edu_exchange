import React from "react";
import Link from "next/link";
import { dm_sans } from "@/utils/fonts";
import { Loader2 } from "lucide-react";

const Button = ({
  text,
  startIcon,
  endIcon,
  className,
  to,
  isLoading = false,
  props,
}) => {
  return (
    <button className={`${dm_sans.className} ${className}`} {...props}>
      {startIcon}
      {isLoading ? (
        <Loader2 className="animate-spin" size={20} />
      ) : to ? (
        <Link href={to}>{text}</Link>
      ) : (
        text
      )}
      {/* {to ? <Link href={to}>{text}</Link> : text}  */}
      {endIcon}
    </button>
  );
};

export default Button;
