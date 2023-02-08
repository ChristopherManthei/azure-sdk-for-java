// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of reservation swap. */
@Fluent
public final class ReservationSwapProperties {
    /*
     * Resource id of the source reservation that gets swapped. Format of the resource id is
     * /providers/microsoft.capacity/reservationOrders/{reservationOrderId}/reservations/{reservationId}
     */
    @JsonProperty(value = "swapSource")
    private String swapSource;

    /*
     * Reservation resource id that the original resource gets swapped to. Format of the resource id is
     * /providers/microsoft.capacity/reservationOrders/{reservationOrderId}/reservations/{reservationId}
     */
    @JsonProperty(value = "swapDestination")
    private String swapDestination;

    /** Creates an instance of ReservationSwapProperties class. */
    public ReservationSwapProperties() {
    }

    /**
     * Get the swapSource property: Resource id of the source reservation that gets swapped. Format of the resource id
     * is /providers/microsoft.capacity/reservationOrders/{reservationOrderId}/reservations/{reservationId}.
     *
     * @return the swapSource value.
     */
    public String swapSource() {
        return this.swapSource;
    }

    /**
     * Set the swapSource property: Resource id of the source reservation that gets swapped. Format of the resource id
     * is /providers/microsoft.capacity/reservationOrders/{reservationOrderId}/reservations/{reservationId}.
     *
     * @param swapSource the swapSource value to set.
     * @return the ReservationSwapProperties object itself.
     */
    public ReservationSwapProperties withSwapSource(String swapSource) {
        this.swapSource = swapSource;
        return this;
    }

    /**
     * Get the swapDestination property: Reservation resource id that the original resource gets swapped to. Format of
     * the resource id is
     * /providers/microsoft.capacity/reservationOrders/{reservationOrderId}/reservations/{reservationId}.
     *
     * @return the swapDestination value.
     */
    public String swapDestination() {
        return this.swapDestination;
    }

    /**
     * Set the swapDestination property: Reservation resource id that the original resource gets swapped to. Format of
     * the resource id is
     * /providers/microsoft.capacity/reservationOrders/{reservationOrderId}/reservations/{reservationId}.
     *
     * @param swapDestination the swapDestination value to set.
     * @return the ReservationSwapProperties object itself.
     */
    public ReservationSwapProperties withSwapDestination(String swapDestination) {
        this.swapDestination = swapDestination;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}