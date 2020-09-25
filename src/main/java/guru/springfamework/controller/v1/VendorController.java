package guru.springfamework.controller.v1;

import guru.springfamework.api.v1.model.VendorDTO;
import guru.springfamework.service.VendorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class VendorController {

    private final VendorService vendorService;

    public VendorController(VendorService vendorService) {
        this.vendorService = vendorService;
    }

    @GetMapping("vendors")
    @ResponseStatus(HttpStatus.OK)
    public List<VendorDTO> getAllVendors() {

        return vendorService.getAllVendors();
    }

    @GetMapping("vendors/{id}")
    @ResponseStatus(HttpStatus.OK)
    public VendorDTO getVendorById(@PathVariable Long id) {

        return vendorService.getVendorById(id);
    }

    @PostMapping("vendors")
    @ResponseStatus(HttpStatus.CREATED)
    public VendorDTO createVendor(@RequestBody VendorDTO vendorDTO) {

        return vendorService.createVendor(vendorDTO);
    }

    @PutMapping("vendors/{id}")
    @ResponseStatus(HttpStatus.OK)
    public VendorDTO updateVendor(@PathVariable Long id, @RequestBody VendorDTO vendorDTO) {

        return vendorService.updateVendor(id, vendorDTO);
    }

    @PatchMapping("vendors/{id}")
    @ResponseStatus(HttpStatus.OK)
    public VendorDTO patchVendor(@PathVariable Long id, @RequestBody VendorDTO vendorDTO) {

        return vendorService.patchVendor(id, vendorDTO);
    }

    @DeleteMapping("vendors/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteVendorById(@PathVariable Long id) {

        vendorService.deleteVendorById(id);
    }

}
