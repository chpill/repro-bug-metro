(require '[cljs.build.api :as api])

(def source-dir "src")

(def compiler-config {:main          'plop.core
                      :output-to     "index.js"
                      :source-map    "index.js.map"
                      :target        :nodejs
                      :optimizations :simple

                      :language-in :ecmascript5
                      :language-out :no-transpile



                      :pseudo-names true



                      :parallel-build true})

(api/build source-dir compiler-config)
