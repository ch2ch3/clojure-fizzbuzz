(ns clojure-fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [clojure-fizzbuzz.core :refer :all]))

(deftest is-divisible-by-three
  (testing "returns true for 3"
    (is (= true (is-divisible-by-three? 3)))))

(deftest is-not-divisible-by-three
  (testing "returns false for 1"
    (is (= false (is-divisible-by-three? 1)))))

(deftest is-divisible-by-five
  (testing "returns true for 5"
    (is (= true (is-divisible-by-five? 5)))))

(deftest is-not-divisible-by-five
  (testing "returns false for 1"
    (is (= false (is-divisible-by-five? 1)))))

(deftest is-divisible-by-fifteen
  (testing "returns true for 15"
    (is (= true (is-divisible-by-fifteen? 15)))))

(deftest is-divisible-by-fifteen
  (testing "returns true for 15"
    (is (= false (is-divisible-by-fifteen? 1)))))