(ns clojure-fizzbuzz.core)

(defn is-divisible-by? [number divisor]
  (zero? (mod number divisor)))

(defn is-divisible-by-three? [number]
  (is-divisible-by? number 3))

(defn is-divisible-by-five? [number]
  (is-divisible-by? number 5))

(defn is-divisible-by-fifteen? [number]
  (is-divisible-by? number 15))