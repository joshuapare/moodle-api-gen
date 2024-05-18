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
from openapi_client.models.mod_lti_create_tool_type200_response_state import ModLtiCreateToolType200ResponseState
from openapi_client.models.mod_lti_create_tool_type200_response_urls import ModLtiCreateToolType200ResponseUrls
from typing import Optional, Set
from typing_extensions import Self

class ModLtiCreateToolType200Response(BaseModel):
    """
    ModLtiCreateToolType200Response
    """ # noqa: E501
    capabilitygroups: Optional[List[Dict[str, Any]]] = None
    clientid: StrictStr = Field(description="Client ID")
    courseid: Optional[StrictInt] = Field(default=0, description="Tool type course")
    deploymentid: StrictInt = Field(description="Deployment ID")
    description: StrictStr = Field(description="Tool type description")
    hascapabilitygroups: StrictBool = Field(description="Indicate if capabilitygroups is populated")
    id: StrictInt = Field(description="Tool type id")
    instancecount: StrictInt = Field(description="The number of times this tool is being used")
    instanceids: Optional[List[Dict[str, Any]]] = None
    name: StrictStr = Field(description="Tool type name")
    platformid: StrictStr = Field(description="Platform ID")
    state: ModLtiCreateToolType200ResponseState
    urls: ModLtiCreateToolType200ResponseUrls
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
        """Create an instance of ModLtiCreateToolType200Response from a JSON string"""
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
        """Create an instance of ModLtiCreateToolType200Response from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "capabilitygroups": obj.get("capabilitygroups"),
            "clientid": obj.get("clientid") if obj.get("clientid") is not None else 'null',
            "courseid": obj.get("courseid") if obj.get("courseid") is not None else 0,
            "deploymentid": obj.get("deploymentid") if obj.get("deploymentid") is not None else null,
            "description": obj.get("description") if obj.get("description") is not None else 'null',
            "hascapabilitygroups": obj.get("hascapabilitygroups") if obj.get("hascapabilitygroups") is not None else False,
            "id": obj.get("id") if obj.get("id") is not None else null,
            "instancecount": obj.get("instancecount") if obj.get("instancecount") is not None else null,
            "instanceids": obj.get("instanceids"),
            "name": obj.get("name") if obj.get("name") is not None else 'null',
            "platformid": obj.get("platformid") if obj.get("platformid") is not None else 'null',
            "state": ModLtiCreateToolType200ResponseState.from_dict(obj["state"]) if obj.get("state") is not None else None,
            "urls": ModLtiCreateToolType200ResponseUrls.from_dict(obj["urls"]) if obj.get("urls") is not None else None
        })
        return _obj

