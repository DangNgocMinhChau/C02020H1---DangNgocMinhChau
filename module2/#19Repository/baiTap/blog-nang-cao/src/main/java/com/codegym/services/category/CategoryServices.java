package com.codegym.services.category;

        import com.codegym.models.Category;
        import org.springframework.data.domain.Page;
        import org.springframework.data.domain.Pageable;

        import java.util.List;

public interface CategoryServices {
    List<Category> findAll();
    Category findById(Integer id);
    void save (Category category);
    void remove(Integer id);
}
