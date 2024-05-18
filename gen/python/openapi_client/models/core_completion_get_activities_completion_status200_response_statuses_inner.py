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
from openapi_client.models.core_completion_get_activities_completion_status200_response_statuses_inner_details_inner import CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner
from typing import Optional, Set
from typing_extensions import Self

class CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner(BaseModel):
    """
    Activity
    """ # noqa: E501
    cmid: Optional[StrictInt] = Field(default=null, description="course module ID")
    details: Optional[List[CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner]] = None
    hascompletion: Optional[StrictBool] = Field(default=False, description="Whether this activity module has completion enabled")
    instance: Optional[StrictInt] = Field(default=null, description="instance ID")
    isautomatic: Optional[StrictBool] = Field(default=False, description="Whether this activity module instance tracks completion automatically.")
    istrackeduser: Optional[StrictBool] = Field(default=False, description="Whether completion is being tracked for this user.")
    modname: Optional[StrictStr] = Field(default='null', description="activity module name")
    overrideby: Optional[StrictInt] = Field(default=null, description="The user id who has overriden the status, or null")
    state: Optional[StrictInt] = Field(default=null, description="Completion state value:                                     0 means incomplete,                                     1 complete,                                     2 complete pass,                                     3 complete fail")
    timecompleted: Optional[StrictInt] = Field(default=null, description="timestamp for completed activity")
    tracking: Optional[StrictInt] = Field(default=null, description="type of tracking:                                     0 means none,                                     1 manual,                                     2 automatic")
    uservisible: Optional[StrictBool] = Field(default=False, description="Whether this activity is visible to the user.")
    valueused: Optional[StrictBool] = Field(default=False, description="Whether the completion status affects the availability of another activity.")
    __properties: ClassVar[List[str]] = ["cmid", "details", "hascompletion", "instance", "isautomatic", "istrackeduser", "modname", "overrideby", "state", "timecompleted", "tracking", "uservisible", "valueused"]

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
        """Create an instance of CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in details (list)
        _items = []
        if self.details:
            for _item in self.details:
                if _item:
                    _items.append(_item.to_dict())
            _dict['details'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "cmid": obj.get("cmid") if obj.get("cmid") is not None else null,
            "details": [CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner.from_dict(_item) for _item in obj["details"]] if obj.get("details") is not None else None,
            "hascompletion": obj.get("hascompletion") if obj.get("hascompletion") is not None else False,
            "instance": obj.get("instance") if obj.get("instance") is not None else null,
            "isautomatic": obj.get("isautomatic") if obj.get("isautomatic") is not None else False,
            "istrackeduser": obj.get("istrackeduser") if obj.get("istrackeduser") is not None else False,
            "modname": obj.get("modname") if obj.get("modname") is not None else 'null',
            "overrideby": obj.get("overrideby") if obj.get("overrideby") is not None else null,
            "state": obj.get("state") if obj.get("state") is not None else null,
            "timecompleted": obj.get("timecompleted") if obj.get("timecompleted") is not None else null,
            "tracking": obj.get("tracking") if obj.get("tracking") is not None else null,
            "uservisible": obj.get("uservisible") if obj.get("uservisible") is not None else False,
            "valueused": obj.get("valueused") if obj.get("valueused") is not None else False
        })
        return _obj

