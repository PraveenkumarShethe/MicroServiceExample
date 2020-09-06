package com.example.SingleGateWayService.model;

/**
 * Created by Praveenkumar on 8/20/2020.
 * The abstract class for all entity classes. This provides the unique id to
 * identify a row in the SQL db.
 * <p>
 */
public class AbstractEntity {

    private Long id;

    /**
     * Returns the identifier of the entity.
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * (non-Javadoc)
     * @see Object#equals(Object)
     */
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (this.id == null || obj == null || !(this.getClass().equals(obj.getClass()))) {
            return false;
        }

        AbstractEntity that = (AbstractEntity) obj;

        return this.id.equals(that.getId());
    }

    /**
     * (non-Javadoc)
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
        return id == null ? 0 : id.hashCode();
    }
}