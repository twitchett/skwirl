(ns skwirl-fe.prod
  (:require
    [skwirl-fe.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
