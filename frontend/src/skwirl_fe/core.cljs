(ns skwirl-fe.core
    (:require
      [reagent.core :as r]))

;; -------------------------
;; Views

(defn item [title content]
  (let [expanded (r/atom false)]
    (fn []
      [:div.item
      [:h3 {:on-click #(swap! expanded not)}
        title]
      (if @expanded
        [:div content])])))


(defn home-page [item]
  [:div 
    [:h2 "Hello Mr Skwirl"]
    [:p "hmmm"]
    item])

(defn btn []
  [:button
    {:on-click (fn [e] (js/alert "omg"))}
    "A button is here"])


;; -------------------------
;; Initialize app

(defn mount-root []
  (r/render [home-page [item "latest" "image"]] (.getElementById js/document "app")))

(defn init! []
  (mount-root))

