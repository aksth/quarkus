package org.akash.soapclient;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class TemplateObject {
    List<CustomField> customFields = new ArrayList<>();
}
