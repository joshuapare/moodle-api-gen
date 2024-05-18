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
from openapi_client.models.mod_data_get_entry200_response_ratinginfo_scales_inner_items_inner import ModDataGetEntry200ResponseRatinginfoScalesInnerItemsInner
from typing import Optional, Set
from typing_extensions import Self

class ModDataGetEntry200ResponseRatinginfoScalesInner(BaseModel):
    """
    Scale information
    """ # noqa: E501
    courseid: Optional[StrictInt] = Field(default=null, description="Course id.")
    id: Optional[StrictInt] = Field(default=None, description="Scale id.")
    isnumeric: Optional[StrictBool] = Field(default=False, description="Whether is a numeric scale.")
    items: Optional[List[ModDataGetEntry200ResponseRatinginfoScalesInnerItemsInner]] = None
    max: Optional[StrictInt] = Field(default=null, description="Max value for the scale.")
    name: Optional[StrictStr] = Field(default='null', description="Scale name (when a real scale is used).")
    __properties: ClassVar[List[str]] = ["courseid", "id", "isnumeric", "items", "max", "name"]

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
        """Create an instance of ModDataGetEntry200ResponseRatinginfoScalesInner from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in items (list)
        _items = []
        if self.items:
            for _item in self.items:
                if _item:
                    _items.append(_item.to_dict())
            _dict['items'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ModDataGetEntry200ResponseRatinginfoScalesInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "courseid": obj.get("courseid") if obj.get("courseid") is not None else null,
            "id": obj.get("id"),
            "isnumeric": obj.get("isnumeric") if obj.get("isnumeric") is not None else False,
            "items": [ModDataGetEntry200ResponseRatinginfoScalesInnerItemsInner.from_dict(_item) for _item in obj["items"]] if obj.get("items") is not None else None,
            "max": obj.get("max") if obj.get("max") is not None else null,
            "name": obj.get("name") if obj.get("name") is not None else 'null'
        })
        return _obj


