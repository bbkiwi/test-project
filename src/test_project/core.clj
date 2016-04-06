(ns test-project.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, Colin"))

(defn evna
  [alpha]
  (fn [d m] (+ (* alpha m) (* (- 1 alpha) d))))

