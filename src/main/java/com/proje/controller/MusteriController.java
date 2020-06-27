package com.proje.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
@Controller
@RequestMapping(value = "/musteri")
public class MusteriController extends MultiActionController {
	
	@RequestMapping(value = "/ekle.html")
	public ModelAndView ekle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String yazi = "MVC ders  ekle metodu";

		return new ModelAndView("musteriView", "sonuc", yazi);
	}
	@RequestMapping(value = "/guncelle.html")
	public ModelAndView guncelle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String yazi= "MVC ders guncelleme metodu";

		return new ModelAndView("musteriView", "sonuc", yazi);
	}
	@RequestMapping(value = "/sil.html")
	public ModelAndView sil(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String yazi = "MVC ders  silme metodu";

		return new ModelAndView("musteriView", "sonuc", yazi);
	}

}
