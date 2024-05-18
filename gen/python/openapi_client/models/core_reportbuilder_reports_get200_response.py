# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.core_reportbuilder_columns_delete200_response import CoreReportbuilderColumnsDelete200Response
from openapi_client.models.core_reportbuilder_conditions_delete200_response import CoreReportbuilderConditionsDelete200Response
from openapi_client.models.core_reportbuilder_filters_delete200_response import CoreReportbuilderFiltersDelete200Response
from openapi_client.models.core_reportbuilder_reports_get200_response_attributes_inner import CoreReportbuilderReportsGet200ResponseAttributesInner
from openapi_client.models.core_reportbuilder_reports_get200_response_cardview import CoreReportbuilderReportsGet200ResponseCardview
from openapi_client.models.core_reportbuilder_reports_get200_response_sidebarmenucards import CoreReportbuilderReportsGet200ResponseSidebarmenucards
from typing import Optional, Set
from typing_extensions import Self

class CoreReportbuilderReportsGet200Response(BaseModel):
    """
    CoreReportbuilderReportsGet200Response
    """ # noqa: E501
    area: StrictStr = Field(description="area")
    attributes: List[CoreReportbuilderReportsGet200ResponseAttributesInner]
    cardview: Optional[CoreReportbuilderReportsGet200ResponseCardview] = None
    classes: StrictStr = Field(description="classes")
    component: StrictStr = Field(description="component")
    conditiondata: StrictStr = Field(description="conditiondata")
    conditions: Optional[CoreReportbuilderConditionsDelete200Response] = None
    contextid: StrictInt = Field(description="contextid")
    editmode: StrictBool = Field(description="editmode")
    filters: Optional[CoreReportbuilderFiltersDelete200Response] = None
    filtersapplied: StrictInt = Field(description="filtersapplied")
    filtersform: StrictStr = Field(description="filtersform")
    filterspresent: StrictBool = Field(description="filterspresent")
    id: StrictInt = Field(description="id")
    itemid: StrictInt = Field(description="itemid")
    javascript: StrictStr = Field(description="javascript")
    name: StrictStr = Field(description="name")
    settingsdata: StrictStr = Field(description="settingsdata")
    sidebarmenucards: Optional[CoreReportbuilderReportsGet200ResponseSidebarmenucards] = None
    sorting: Optional[CoreReportbuilderColumnsDelete200Response] = None
    source: StrictStr = Field(description="source")
    table: StrictStr = Field(description="table")
    timecreated: StrictInt = Field(description="timecreated")
    timemodified: StrictInt = Field(description="timemodified")
    type: StrictInt = Field(description="type")
    uniquerows: StrictBool = Field(description="uniquerows")
    usercreated: StrictInt = Field(description="usercreated")
    usermodified: StrictInt = Field(description="usermodified")
    __properties: ClassVar[List[str]] = ["area", "attributes", "cardview", "classes", "component", "conditiondata", "conditions", "contextid", "editmode", "filters", "filtersapplied", "filtersform", "filterspresent", "id", "itemid", "javascript", "name", "settingsdata", "sidebarmenucards", "sorting", "source", "table", "timecreated", "timemodified", "type", "uniquerows", "usercreated", "usermodified"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of CoreReportbuilderReportsGet200Response from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of each item in attributes (list)
        _items = []
        if self.attributes:
            for _item in self.attributes:
                if _item:
                    _items.append(_item.to_dict())
            _dict['attributes'] = _items
        # override the default output from pydantic by calling `to_dict()` of cardview
        if self.cardview:
            _dict['cardview'] = self.cardview.to_dict()
        # override the default output from pydantic by calling `to_dict()` of conditions
        if self.conditions:
            _dict['conditions'] = self.conditions.to_dict()
        # override the default output from pydantic by calling `to_dict()` of filters
        if self.filters:
            _dict['filters'] = self.filters.to_dict()
        # override the default output from pydantic by calling `to_dict()` of sidebarmenucards
        if self.sidebarmenucards:
            _dict['sidebarmenucards'] = self.sidebarmenucards.to_dict()
        # override the default output from pydantic by calling `to_dict()` of sorting
        if self.sorting:
            _dict['sorting'] = self.sorting.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of CoreReportbuilderReportsGet200Response from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "area": obj.get("area") if obj.get("area") is not None else '',
            "attributes": [CoreReportbuilderReportsGet200ResponseAttributesInner.from_dict(_item) for _item in obj["attributes"]] if obj.get("attributes") is not None else None,
            "cardview": CoreReportbuilderReportsGet200ResponseCardview.from_dict(obj["cardview"]) if obj.get("cardview") is not None else None,
            "classes": obj.get("classes") if obj.get("classes") is not None else 'null',
            "component": obj.get("component") if obj.get("component") is not None else '',
            "conditiondata": obj.get("conditiondata"),
            "conditions": CoreReportbuilderConditionsDelete200Response.from_dict(obj["conditions"]) if obj.get("conditions") is not None else None,
            "contextid": obj.get("contextid") if obj.get("contextid") is not None else {},
            "editmode": obj.get("editmode") if obj.get("editmode") is not None else False,
            "filters": CoreReportbuilderFiltersDelete200Response.from_dict(obj["filters"]) if obj.get("filters") is not None else None,
            "filtersapplied": obj.get("filtersapplied") if obj.get("filtersapplied") is not None else null,
            "filtersform": obj.get("filtersform") if obj.get("filtersform") is not None else 'null',
            "filterspresent": obj.get("filterspresent") if obj.get("filterspresent") is not None else False,
            "id": obj.get("id") if obj.get("id") is not None else 0,
            "itemid": obj.get("itemid") if obj.get("itemid") is not None else 0,
            "javascript": obj.get("javascript"),
            "name": obj.get("name"),
            "settingsdata": obj.get("settingsdata"),
            "sidebarmenucards": CoreReportbuilderReportsGet200ResponseSidebarmenucards.from_dict(obj["sidebarmenucards"]) if obj.get("sidebarmenucards") is not None else None,
            "sorting": CoreReportbuilderColumnsDelete200Response.from_dict(obj["sorting"]) if obj.get("sorting") is not None else None,
            "source": obj.get("source"),
            "table": obj.get("table") if obj.get("table") is not None else 'null',
            "timecreated": obj.get("timecreated") if obj.get("timecreated") is not None else 0,
            "timemodified": obj.get("timemodified") if obj.get("timemodified") is not None else 0,
            "type": obj.get("type"),
            "uniquerows": obj.get("uniquerows") if obj.get("uniquerows") is not None else False,
            "usercreated": obj.get("usercreated") if obj.get("usercreated") is not None else {},
            "usermodified": obj.get("usermodified") if obj.get("usermodified") is not None else 0
        })
        return _obj

