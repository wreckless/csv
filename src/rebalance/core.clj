(ns rebalance.core)

(require '[clojure.data.csv :as csv])

(defn get-targets
  "now gets targets from file"
  [file-name]
  (csv/read-csv (slurp file-name)))