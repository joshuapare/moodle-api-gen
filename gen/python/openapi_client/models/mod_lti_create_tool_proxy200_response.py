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
from typing import Any, ClassVar, Dict, List
from typing import Optional, Set
from typing_extensions import Self

class ModLtiCreateToolProxy200Response(BaseModel):
    """
    ModLtiCreateToolProxy200Response
    """ # noqa: E501
    capabilityoffered: StrictStr = Field(description="Tool proxy capabilities offered")
    guid: StrictStr = Field(description="Tool proxy globally unique identifier")
    id: StrictInt = Field(description="Tool proxy id")
    name: StrictStr = Field(description="Tool proxy name")
    regurl: StrictStr = Field(description="Tool proxy registration URL")
    secret: StrictStr = Field(description="Tool proxy shared secret")
    serviceoffered: StrictStr = Field(description="Tool proxy services offered")
    state: StrictInt = Field(description="Tool proxy state")
    timecreated: StrictInt = Field(description="Tool proxy time created")
    timemodified: StrictInt = Field(description="Tool proxy modified")
    toolproxy: StrictStr = Field(description="Tool proxy")
    vendorcode: StrictStr = Field(description="Tool proxy consumer code")
    __properties: ClassVar[List[str]] = ["capabilityoffered", "guid", "id", "name", "regurl", "secret", "serviceoffered", "state", "timecreated", "timemodified", "toolproxy", "vendorcode"]

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
        """Create an instance of ModLtiCreateToolProxy200Response from a JSON string"""
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
        """Create an instance of ModLtiCreateToolProxy200Response from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "capabilityoffered": obj.get("capabilityoffered") if obj.get("capabilityoffered") is not None else 'null',
            "guid": obj.get("guid") if obj.get("guid") is not None else 'null',
            "id": obj.get("id") if obj.get("id") is not None else null,
            "name": obj.get("name") if obj.get("name") is not None else 'null',
            "regurl": obj.get("regurl"),
            "secret": obj.get("secret") if obj.get("secret") is not None else 'null',
            "serviceoffered": obj.get("serviceoffered") if obj.get("serviceoffered") is not None else 'null',
            "state": obj.get("state") if obj.get("state") is not None else null,
            "timecreated": obj.get("timecreated") if obj.get("timecreated") is not None else null,
            "timemodified": obj.get("timemodified") if obj.get("timemodified") is not None else null,
            "toolproxy": obj.get("toolproxy") if obj.get("toolproxy") is not None else 'null',
            "vendorcode": obj.get("vendorcode") if obj.get("vendorcode") is not None else 'null'
        })
        return _obj


