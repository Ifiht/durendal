(ns durendal.dirty-socks.sks
  "Wrapper for java.net that allows native clojure manipulation of sockets and their data as simple strings."
  (:import (java.net Socket)))
;==========================~ Private Functions ~==========================;

;==========================~ Public Functions ~===========================;
(defn make-sock
  "Connect a socket to a remote host. The call blocks until
   the socket is connected."
  [^String hostname ^Integer port]
  (Socket. hostname port))

(defn kill-sock ;Add variable cleanup
  "Close the socket, and also closes its input and output streams."
  [^Socket socket]
  (.close socket))

(defn read-sock
  "Give a description"
  [^Socket socket]
  (let [i (.getInputStream socket)]
    (.read i)
  ))

(defn tell-sock
  "Give a description"
  [^Socket socket ^String output]
  (.getOutputStream socket))