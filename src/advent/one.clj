(ns advent.one)

(defn str->int [str]
  (if (re-matches (re-pattern "\\d+") str)
      (read-string str)
      -1))

(defn one []
  (->> (slurp "/Users/Tom.Thornton/src/advent/input/one")
       (clojure.string/split-lines)
       (map #(str->int %))
       (partition-by #(= -1 %))
       (map #(reduce + %))
       ; (apply max)))
       (sort >)
       (take 3)
       (reduce +)))