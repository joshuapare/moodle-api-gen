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

from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerAlignmentInner(BaseModel):
    """
    CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerAlignmentInner
    """ # noqa: E501
    badgeid: Optional[StrictInt] = Field(default=null, description="Badge id")
    id: Optional[StrictInt] = Field(default=null, description="Alignment id")
    target_code: Optional[StrictStr] = Field(default='null', description="Target code", alias="targetCode")
    target_description: Optional[StrictStr] = Field(default='null', description="Target description", alias="targetDescription")
    target_framework: Optional[StrictStr] = Field(default='null', description="Target framework", alias="targetFramework")
    target_name: Optional[StrictStr] = Field(default='null', description="Target name", alias="targetName")
    target_url: Optional[StrictStr] = Field(default='null', description="Target URL", alias="targetUrl")
    __properties: ClassVar[List[str]] = ["badgeid", "id", "targetCode", "targetDescription", "targetFramework", "targetName", "targetUrl"]

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
        """Create an instance of CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerAlignmentInner from a JSON string"""
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
        """Create an instance of CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerAlignmentInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "badgeid": obj.get("badgeid") if obj.get("badgeid") is not None else null,
            "id": obj.get("id") if obj.get("id") is not None else null,
            "targetCode": obj.get("targetCode") if obj.get("targetCode") is not None else 'null',
            "targetDescription": obj.get("targetDescription") if obj.get("targetDescription") is not None else 'null',
            "targetFramework": obj.get("targetFramework") if obj.get("targetFramework") is not None else 'null',
            "targetName": obj.get("targetName") if obj.get("targetName") is not None else 'null',
            "targetUrl": obj.get("targetUrl") if obj.get("targetUrl") is not None else 'null'
        })
        return _obj


