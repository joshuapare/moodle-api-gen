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

from pydantic import BaseModel, ConfigDict
from typing import Any, ClassVar, Dict, List
from openapi_client.models.mod_workshop_get_user_plan200_response_userplan_examples_inner import ModWorkshopGetUserPlan200ResponseUserplanExamplesInner
from openapi_client.models.mod_workshop_get_user_plan200_response_userplan_phases_inner import ModWorkshopGetUserPlan200ResponseUserplanPhasesInner
from typing import Optional, Set
from typing_extensions import Self

class ModWorkshopGetUserPlan200ResponseUserplan(BaseModel):
    """
    ModWorkshopGetUserPlan200ResponseUserplan
    """ # noqa: E501
    examples: List[ModWorkshopGetUserPlan200ResponseUserplanExamplesInner]
    phases: List[ModWorkshopGetUserPlan200ResponseUserplanPhasesInner]
    __properties: ClassVar[List[str]] = ["examples", "phases"]

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
        """Create an instance of ModWorkshopGetUserPlan200ResponseUserplan from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in examples (list)
        _items = []
        if self.examples:
            for _item in self.examples:
                if _item:
                    _items.append(_item.to_dict())
            _dict['examples'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in phases (list)
        _items = []
        if self.phases:
            for _item in self.phases:
                if _item:
                    _items.append(_item.to_dict())
            _dict['phases'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ModWorkshopGetUserPlan200ResponseUserplan from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "examples": [ModWorkshopGetUserPlan200ResponseUserplanExamplesInner.from_dict(_item) for _item in obj["examples"]] if obj.get("examples") is not None else None,
            "phases": [ModWorkshopGetUserPlan200ResponseUserplanPhasesInner.from_dict(_item) for _item in obj["phases"]] if obj.get("phases") is not None else None
        })
        return _obj

