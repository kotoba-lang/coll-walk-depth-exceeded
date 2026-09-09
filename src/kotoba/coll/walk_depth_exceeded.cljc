(ns kotoba.coll.walk-depth-exceeded
  "walk-depth-exceeded! -- one definition, addressed on its own.

  Split out of kotoba.lang.text on 2026-09-09. The unit here is the
  DEFINITION, not the library: this repo holds walk-depth-exceeded! and names, in its
  deps.edn, exactly the definitions walk-depth-exceeded! reaches. Nothing else."
  (:require [kotoba.coll.walk :refer [walk]]))

(defn walk-depth-exceeded! [limit]
  (throw (ex-info "coll walk exceeds bounded depth limit"
                   {:kotoba.lang.coll/reason :walk/depth-exceeded :limit limit})))
