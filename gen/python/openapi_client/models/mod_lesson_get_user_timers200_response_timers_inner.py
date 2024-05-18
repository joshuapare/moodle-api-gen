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
from typing import Optional, Set
from typing_extensions import Self

class ModLessonGetUserTimers200ResponseTimersInner(BaseModel):
    """
    The timers
    """ # noqa: E501
    completed: Optional[StrictInt] = Field(default=null, description="If the lesson for this timer was completed")
    id: Optional[StrictInt] = Field(default=None, description="The attempt id")
    lessonid: Optional[StrictInt] = Field(default=null, description="The lesson id")
    lessontime: Optional[StrictInt] = Field(default=null, description="Last access time to the lesson during the timer session")
    starttime: Optional[StrictInt] = Field(default=null, description="First access time for a new timer session")
    timemodifiedoffline: Optional[StrictInt] = Field(default=null, description="Last modified time via webservices.")
    userid: Optional[StrictInt] = Field(default=None, description="The user id")
    __properties: ClassVar[List[str]] = ["completed", "id", "lessonid", "lessontime", "starttime", "timemodifiedoffline", "userid"]

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
        """Create an instance of ModLessonGetUserTimers200ResponseTimersInner from a JSON string"""
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
        """Create an instance of ModLessonGetUserTimers200ResponseTimersInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "completed": obj.get("completed") if obj.get("completed") is not None else null,
            "id": obj.get("id"),
            "lessonid": obj.get("lessonid") if obj.get("lessonid") is not None else null,
            "lessontime": obj.get("lessontime") if obj.get("lessontime") is not None else null,
            "starttime": obj.get("starttime") if obj.get("starttime") is not None else null,
            "timemodifiedoffline": obj.get("timemodifiedoffline") if obj.get("timemodifiedoffline") is not None else null,
            "userid": obj.get("userid")
        })
        return _obj

