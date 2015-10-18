(ns durendal.core
  (:gen-class)
    (:require [durendal.dirty-socks.sock
               :refer [make-sock dump-sock read-sock tell-sock]]))

(defn -main "Main func descr." []
	(println (+ 1 1)))