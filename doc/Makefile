#! /usr/bin/make -f
#
# $Id: Makefile 174 2004-09-28 23:33:43Z dsevilla $
#
FILES=TUG_doc

all: $(patsubst %,%.pdf,$(FILES))

clean: $(patsubst %,clean-%,$(FILES))
	rm -rf *~

define TeX_rules
$(1).pdf: $(1).tex dummy-$(1)
	latexmk -pdf $$<

clean-$(1): $(1).tex
	latexmk -c $$<
	rm -rf $(1).nav $(1).toc $(1).out $(1).snm $(1).bbl $(1).blg

.depend.$(1): $(1).tex
	./texdepend.pl $$< >$$@

include .depend.$(1)

.PHONY: clean-$(1) dummy-$(1)
endef

$(foreach texfile,$(FILES),$(eval $(call TeX_rules,$(texfile))))

.PHONY: all clean
