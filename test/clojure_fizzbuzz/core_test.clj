(ns clojure-fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [clojure-fizzbuzz.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest is-divisible-by-three
  (testing "returns 3 for 3"
    (is (= true (is-divisible-by-three? 3)))))

(deftest is-not-divisible-by-three
  (testing "returns false for 1"
    (is (= false (is-divisible-by-three? 1)))))