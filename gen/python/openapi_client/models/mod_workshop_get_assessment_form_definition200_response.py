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

from pydantic import BaseModel, ConfigDict, Field, StrictInt
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.auth_email_signup_user200_response_warnings_inner import AuthEmailSignupUser200ResponseWarningsInner
from openapi_client.models.core_block_get_dashboard_blocks200_response_blocks_inner_contents_files_inner import CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner
from openapi_client.models.mod_workshop_get_assessment_form_definition200_response_current_inner import ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner
from openapi_client.models.mod_workshop_get_assessment_form_definition200_response_dimensionsinfo_inner import ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner
from openapi_client.models.mod_workshop_get_assessment_form_definition200_response_fields_inner import ModWorkshopGetAssessmentFormDefinition200ResponseFieldsInner
from openapi_client.models.mod_workshop_get_assessment_form_definition200_response_options_inner import ModWorkshopGetAssessmentFormDefinition200ResponseOptionsInner
from typing import Optional, Set
from typing_extensions import Self

class ModWorkshopGetAssessmentFormDefinition200Response(BaseModel):
    """
    ModWorkshopGetAssessmentFormDefinition200Response
    """ # noqa: E501
    current: List[ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner]
    descriptionfiles: List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]
    dimensionsinfo: List[ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner]
    dimenssionscount: StrictInt = Field(description="The number of dimenssions used by the form.")
    fields: List[ModWorkshopGetAssessmentFormDefinition200ResponseFieldsInner]
    options: List[ModWorkshopGetAssessmentFormDefinition200ResponseOptionsInner]
    warnings: Optional[List[AuthEmailSignupUser200ResponseWarningsInner]] = None
    __properties: ClassVar[List[str]] = ["current", "descriptionfiles", "dimensionsinfo", "dimenssionscount", "fields", "options", "warnings"]

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
        """Create an instance of ModWorkshopGetAssessmentFormDefinition200Response from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in current (list)
        _items = []
        if self.current:
            for _item in self.current:
                if _item:
                    _items.append(_item.to_dict())
            _dict['current'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in descriptionfiles (list)
        _items = []
        if self.descriptionfiles:
            for _item in self.descriptionfiles:
                if _item:
                    _items.append(_item.to_dict())
            _dict['descriptionfiles'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in dimensionsinfo (list)
        _items = []
        if self.dimensionsinfo:
            for _item in self.dimensionsinfo:
                if _item:
                    _items.append(_item.to_dict())
            _dict['dimensionsinfo'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in fields (list)
        _items = []
        if self.fields:
            for _item in self.fields:
                if _item:
                    _items.append(_item.to_dict())
            _dict['fields'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in options (list)
        _items = []
        if self.options:
            for _item in self.options:
                if _item:
                    _items.append(_item.to_dict())
            _dict['options'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in warnings (list)
        _items = []
        if self.warnings:
            for _item in self.warnings:
                if _item:
                    _items.append(_item.to_dict())
            _dict['warnings'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ModWorkshopGetAssessmentFormDefinition200Response from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "current": [ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner.from_dict(_item) for _item in obj["current"]] if obj.get("current") is not None else None,
            "descriptionfiles": [CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.from_dict(_item) for _item in obj["descriptionfiles"]] if obj.get("descriptionfiles") is not None else None,
            "dimensionsinfo": [ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner.from_dict(_item) for _item in obj["dimensionsinfo"]] if obj.get("dimensionsinfo") is not None else None,
            "dimenssionscount": obj.get("dimenssionscount") if obj.get("dimenssionscount") is not None else null,
            "fields": [ModWorkshopGetAssessmentFormDefinition200ResponseFieldsInner.from_dict(_item) for _item in obj["fields"]] if obj.get("fields") is not None else None,
            "options": [ModWorkshopGetAssessmentFormDefinition200ResponseOptionsInner.from_dict(_item) for _item in obj["options"]] if obj.get("options") is not None else None,
            "warnings": [AuthEmailSignupUser200ResponseWarningsInner.from_dict(_item) for _item in obj["warnings"]] if obj.get("warnings") is not None else None
        })
        return _obj

