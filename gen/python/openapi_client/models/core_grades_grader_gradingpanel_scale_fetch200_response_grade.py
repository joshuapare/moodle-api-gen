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
from openapi_client.models.core_grades_grader_gradingpanel_scale_fetch200_response_grade_options_inner import CoreGradesGraderGradingpanelScaleFetch200ResponseGradeOptionsInner
from typing import Optional, Set
from typing_extensions import Self

class CoreGradesGraderGradingpanelScaleFetch200ResponseGrade(BaseModel):
    """
    CoreGradesGraderGradingpanelScaleFetch200ResponseGrade
    """ # noqa: E501
    gradedby: StrictStr = Field(description="The assumed grader of this grading instance")
    maxgrade: StrictStr = Field(description="Max possible grade")
    options: List[CoreGradesGraderGradingpanelScaleFetch200ResponseGradeOptionsInner]
    timecreated: StrictInt = Field(description="The time that the grade was created")
    timemodified: StrictInt = Field(description="The time that the grade was last updated")
    usergrade: StrictStr = Field(description="Current user grade")
    __properties: ClassVar[List[str]] = ["gradedby", "maxgrade", "options", "timecreated", "timemodified", "usergrade"]

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
        """Create an instance of CoreGradesGraderGradingpanelScaleFetch200ResponseGrade from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in options (list)
        _items = []
        if self.options:
            for _item in self.options:
                if _item:
                    _items.append(_item.to_dict())
            _dict['options'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of CoreGradesGraderGradingpanelScaleFetch200ResponseGrade from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "gradedby": obj.get("gradedby"),
            "maxgrade": obj.get("maxgrade"),
            "options": [CoreGradesGraderGradingpanelScaleFetch200ResponseGradeOptionsInner.from_dict(_item) for _item in obj["options"]] if obj.get("options") is not None else None,
            "timecreated": obj.get("timecreated"),
            "timemodified": obj.get("timemodified"),
            "usergrade": obj.get("usergrade")
        })
        return _obj


