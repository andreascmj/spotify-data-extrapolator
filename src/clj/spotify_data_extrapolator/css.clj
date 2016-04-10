(ns spotify-data-extrapolator.css
  (:require [garden.def :refer [defstyles defcssfn]]
            [garden.stylesheet :refer [at-import]]))

(def spotify-color "#23CF5F")
(def page-width "980px")
(defcssfn url)

(defstyles screen
  (at-import (url "https://fonts.googleapis.com/css?family=Lato:100,300,400,700,900,100italic,300italic,400italic,700italic,900italic"))
  [:body {:font-family ["Lato" "sans-serif"]
          :font-size   "20px"
          :font-weight 300
          :width       page-width
          :margin      "0 auto"
          :padding     0}]
  [:.app-header {:color spotify-color
                 :font-size "80px"
                 :font-weight 300}]
  [:.btn {:color   spotify-color
          :padding "10px 20px 10px 20px"
          :margin-top "10px"
          :margin-bottom "10px"
          :background "#424242"
          :border-radius "10px"
          :display "inline-block"}]
  [:.app-name {:color spotify-color}])
