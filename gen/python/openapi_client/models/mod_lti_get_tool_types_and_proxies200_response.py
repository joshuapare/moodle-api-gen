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
from openapi_client.models.mod_lti_get_tool_types_and_proxies200_response_proxies_inner import ModLtiGetToolTypesAndProxies200ResponseProxiesInner
from openapi_client.models.mod_lti_get_tool_types_and_proxies200_response_types_inner import ModLtiGetToolTypesAndProxies200ResponseTypesInner
from typing import Optional, Set
from typing_extensions import Self

class ModLtiGetToolTypesAndProxies200Response(BaseModel):
    """
    ModLtiGetToolTypesAndProxies200Response
    """ # noqa: E501
    limit: Optional[StrictInt] = Field(default=null, description="Limit of how many tool types to show")
    offset: Optional[StrictInt] = Field(default=null, description="Offset of tool types")
    proxies: List[ModLtiGetToolTypesAndProxies200ResponseProxiesInner]
    types: List[ModLtiGetToolTypesAndProxies200ResponseTypesInner]
    __properties: ClassVar[List[str]] = ["limit", "offset", "proxies", "types"]

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
        """Create an instance of ModLtiGetToolTypesAndProxies200Response from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in proxies (list)
        _items = []
        if self.proxies:
            for _item in self.proxies:
                if _item:
                    _items.append(_item.to_dict())
            _dict['proxies'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in types (list)
        _items = []
        if self.types:
            for _item in self.types:
                if _item:
                    _items.append(_item.to_dict())
            _dict['types'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ModLtiGetToolTypesAndProxies200Response from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "limit": obj.get("limit") if obj.get("limit") is not None else null,
            "offset": obj.get("offset") if obj.get("offset") is not None else null,
            "proxies": [ModLtiGetToolTypesAndProxies200ResponseProxiesInner.from_dict(_item) for _item in obj["proxies"]] if obj.get("proxies") is not None else None,
            "types": [ModLtiGetToolTypesAndProxies200ResponseTypesInner.from_dict(_item) for _item in obj["types"]] if obj.get("types") is not None else None
        })
        return _obj


