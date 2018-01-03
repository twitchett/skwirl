(ns ^:figwheel-no-load skwirl-fe.dev
  (:require
    [skwirl-fe.core :as core]
    [devtools.core :as devtools]))


(enable-console-print!)

(devtools/install!)

(core/init!)
