(ns umbrella-weather.handler.example
  (:require [ataraxy.core :as ataraxy]
            [ataraxy.response :as response] 
            [clojure.java.io :as io]
            [integrant.core :as ig]))

(defmethod ig/init-key :umbrella-weather.handler/example [_ options]
  (fn [{[_] :ataraxy/result}]
    [::response/ok (io/resource "umbrella_weather/handler/example/example.html")]))
