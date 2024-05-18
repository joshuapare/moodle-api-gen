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

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.core_block_get_dashboard_blocks200_response_blocks_inner_contents_files_inner import CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner
from openapi_client.models.tool_mobile_get_content200_response_otherdata_inner import ToolMobileGetContent200ResponseOtherdataInner
from openapi_client.models.tool_mobile_get_content200_response_restrict import ToolMobileGetContent200ResponseRestrict
from openapi_client.models.tool_mobile_get_content200_response_templates_inner import ToolMobileGetContent200ResponseTemplatesInner
from typing import Optional, Set
from typing_extensions import Self

class ToolMobileGetContent200Response(BaseModel):
    """
    ToolMobileGetContent200Response
    """ # noqa: E501
    disabled: Optional[StrictBool] = Field(default=False, description="Whether we consider this disabled or not.")
    files: List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]
    javascript: StrictStr = Field(description="JavaScript code.")
    otherdata: List[ToolMobileGetContent200ResponseOtherdataInner]
    restrict: ToolMobileGetContent200ResponseRestrict
    templates: List[ToolMobileGetContent200ResponseTemplatesInner]
    __properties: ClassVar[List[str]] = ["disabled", "files", "javascript", "otherdata", "restrict", "templates"]

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
        """Create an instance of ToolMobileGetContent200Response from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in files (list)
        _items = []
        if self.files:
            for _item in self.files:
                if _item:
                    _items.append(_item.to_dict())
            _dict['files'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in otherdata (list)
        _items = []
        if self.otherdata:
            for _item in self.otherdata:
                if _item:
                    _items.append(_item.to_dict())
            _dict['otherdata'] = _items
        # override the default output from pydantic by calling `to_dict()` of restrict
        if self.restrict:
            _dict['restrict'] = self.restrict.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in templates (list)
        _items = []
        if self.templates:
            for _item in self.templates:
                if _item:
                    _items.append(_item.to_dict())
            _dict['templates'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ToolMobileGetContent200Response from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "disabled": obj.get("disabled") if obj.get("disabled") is not None else False,
            "files": [CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.from_dict(_item) for _item in obj["files"]] if obj.get("files") is not None else None,
            "javascript": obj.get("javascript") if obj.get("javascript") is not None else 'null',
            "otherdata": [ToolMobileGetContent200ResponseOtherdataInner.from_dict(_item) for _item in obj["otherdata"]] if obj.get("otherdata") is not None else None,
            "restrict": ToolMobileGetContent200ResponseRestrict.from_dict(obj["restrict"]) if obj.get("restrict") is not None else None,
            "templates": [ToolMobileGetContent200ResponseTemplatesInner.from_dict(_item) for _item in obj["templates"]] if obj.get("templates") is not None else None
        })
        return _obj


