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

from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class CoreUserGetUsersRequestCriteriaInner(BaseModel):
    """
    CoreUserGetUsersRequestCriteriaInner
    """ # noqa: E501
    key: Optional[StrictStr] = Field(default='null', description="the user column to search, expected keys (value format) are:                                 \"id\" (int) matching user id,                                 \"lastname\" (string) user last name (Note: you can use % for searching but it may be considerably slower!),                                 \"firstname\" (string) user first name (Note: you can use % for searching but it may be considerably slower!),                                 \"idnumber\" (string) matching user idnumber,                                 \"username\" (string) matching user username,                                 \"email\" (string) user email (Note: you can use % for searching but it may be considerably slower!),                                 \"auth\" (string) matching user auth plugin")
    value: Optional[StrictStr] = Field(default=None, description="the value to search")
    __properties: ClassVar[List[str]] = ["key", "value"]

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
        """Create an instance of CoreUserGetUsersRequestCriteriaInner from a JSON string"""
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
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of CoreUserGetUsersRequestCriteriaInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "key": obj.get("key") if obj.get("key") is not None else 'null',
            "value": obj.get("value")
        })
        return _obj


