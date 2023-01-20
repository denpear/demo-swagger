package com.dp.demoswagger;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.api.PetApi;
import io.swagger.api.StoreApi;
import io.swagger.api.UserApi;
import io.swagger.model.ModelApiResponse;
import io.swagger.model.Order;
import io.swagger.model.Pet;
import io.swagger.model.User;


@RestController
public class PetController implements PetApi, StoreApi, UserApi {
    @Override
    public Optional<ObjectMapper> getObjectMapper() {
        return PetApi.super.getObjectMapper();
    }

    @Override
    public Optional<HttpServletRequest> getRequest() {
        return PetApi.super.getRequest();
    }

    @Override
    public Optional<String> getAcceptHeader() {
        return PetApi.super.getAcceptHeader();
    }

    @Override
    public ResponseEntity<User> createUser(User body) {
        return UserApi.super.createUser(body);
    }

    @Override
    public ResponseEntity<User> createUsersWithListInput(List<User> body) {
        return UserApi.super.createUsersWithListInput(body);
    }

    @Override
    public ResponseEntity<Void> deleteUser(String username) {
        return UserApi.super.deleteUser(username);
    }

    @Override
    public ResponseEntity<User> getUserByName(String username) {
        return UserApi.super.getUserByName(username);
    }

    @Override
    public ResponseEntity<String> loginUser(String username, String password) {
        return UserApi.super.loginUser(username, password);
    }

    @Override
    public ResponseEntity<Void> logoutUser() {
        return UserApi.super.logoutUser();
    }

    @Override
    public ResponseEntity<Void> updateUser(String username, User body) {
        return UserApi.super.updateUser(username, body);
    }

    @Override
    public ResponseEntity<Void> deleteOrder(Long orderId) {
        return StoreApi.super.deleteOrder(orderId);
    }

    @Override
    public ResponseEntity<Map<String, Integer>> getInventory() {
        return StoreApi.super.getInventory();
    }

    @Override
    public ResponseEntity<Order> getOrderById(Long orderId) {
        return StoreApi.super.getOrderById(orderId);
    }

    @Override
    public ResponseEntity<Order> placeOrder(Order body) {
        return StoreApi.super.placeOrder(body);
    }

    @Override
    public ResponseEntity<Pet> addPet(Pet body) {
        return PetApi.super.addPet(body);
    }

    @Override
    public ResponseEntity<Void> deletePet(Long petId, String apiKey) {
        return PetApi.super.deletePet(petId, apiKey);
    }

    @Override
    public ResponseEntity<List<Pet>> findPetsByStatus(String status) {
        return PetApi.super.findPetsByStatus(status);
    }

    @Override
    public ResponseEntity<List<Pet>> findPetsByTags(List<String> tags) {
        return PetApi.super.findPetsByTags(tags);
    }

    @Override
    public ResponseEntity<Pet> getPetById(Long petId) {
        return PetApi.super.getPetById(petId);
    }

    @Override
    public ResponseEntity<Pet> updatePet(Pet body) {
        return PetApi.super.updatePet(body);
    }

    @Override
    public ResponseEntity<Void> updatePetWithForm(Long petId, String name, String status) {
        return PetApi.super.updatePetWithForm(petId, name, status);
    }

    @Override
    public ResponseEntity<ModelApiResponse> uploadFile(Long petId, String additionalMetadata, Object body) {
        return PetApi.super.uploadFile(petId, additionalMetadata, body);
    }
}
