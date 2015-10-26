(ns durendal.core
  (:gen-class)
    (:require [durendal.dirty-socks.sks
               :refer [make-sock kill-sock read-sock tell-sock]]))

(defn -main "Main func descr." []
	(println (+ 1 1)))