(ns plop.core
  (:require react
            [react-native :as rn]))


(defn app []
  (react/createElement
   rn/View #js {:flex 1
                :backgroundColor "green"}
   (react/createElement rn/Text #js {} "PLOP!")))


(rn/AppRegistry.registerComponent "plop"
                                  (fn [] app))



