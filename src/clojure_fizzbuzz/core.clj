(ns clojure-fizzbuzz.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn is-divisible-by-three? [number]
  (zero? (mod number 3)))

(defn is-divisible-by-five? [number]
  (zero? (mod number 5)))

(defn is-divisible-by-fifteen? [number]
  (zero? (mod number 15)))