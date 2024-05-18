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
from openapi_client.models.mod_lti_get_tool_types_and_proxies200_response_types_inner_state import ModLtiGetToolTypesAndProxies200ResponseTypesInnerState
from openapi_client.models.mod_lti_get_tool_types_and_proxies200_response_types_inner_urls import ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls
from typing import Optional, Set
from typing_extensions import Self

class ModLtiGetToolTypesAndProxies200ResponseTypesInner(BaseModel):
    """
    Tool
    """ # noqa: E501
    capabilitygroups: Optional[List[Dict[str, Any]]] = None
    clientid: Optional[StrictStr] = Field(default=None, description="Client ID")
    courseid: Optional[StrictInt] = Field(default=0, description="Tool type course")
    deploymentid: Optional[StrictInt] = Field(default=None, description="Deployment ID")
    description: Optional[StrictStr] = Field(default=None, description="Tool type description")
    hascapabilitygroups: Optional[StrictBool] = Field(default=None, description="Indicate if capabilitygroups is populated")
    id: Optional[StrictInt] = Field(default=None, description="Tool type id")
    instancecount: Optional[StrictInt] = Field(default=None, description="The number of times this tool is being used")
    instanceids: Optional[List[Dict[str, Any]]] = None
    name: Optional[StrictStr] = Field(default=None, description="Tool type name")
    platformid: Optional[StrictStr] = Field(default=None, description="Platform ID")
    state: Optional[ModLtiGetToolTypesAndProxies200ResponseTypesInnerState] = None
    urls: Optional[ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls] = None
    __properties: ClassVar[List[str]] = ["capabilitygroups", "clientid", "courseid", "deploymentid", "description", "hascapabilitygroups", "id", "instancecount", "instanceids", "name", "platformid", "state", "urls"]

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
        """Create an instance of ModLtiGetToolTypesAndProxies200ResponseTypesInner from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of state
        if self.state:
            _dict['state'] = self.state.to_dict()
        # override the default output from pydantic by calling `to_dict()` of urls
        if self.urls:
            _dict['urls'] = self.urls.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ModLtiGetToolTypesAndProxies200ResponseTypesInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "capabilitygroups": obj.get("capabilitygroups"),
            "clientid": obj.get("clientid"),
            "courseid": obj.get("courseid") if obj.get("courseid") is not None else 0,
            "deploymentid": obj.get("deploymentid"),
            "description": obj.get("description"),
            "hascapabilitygroups": obj.get("hascapabilitygroups"),
            "id": obj.get("id"),
            "instancecount": obj.get("instancecount"),
            "instanceids": obj.get("instanceids"),
            "name": obj.get("name"),
            "platformid": obj.get("platformid"),
            "state": ModLtiGetToolTypesAndProxies200ResponseTypesInnerState.from_dict(obj["state"]) if obj.get("state") is not None else None,
            "urls": ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls.from_dict(obj["urls"]) if obj.get("urls") is not None else None
        })
        return _obj

