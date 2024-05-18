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

from pydantic import BaseModel, ConfigDict, Field, StrictFloat, StrictInt
from typing import Any, ClassVar, Dict, List, Union
from typing import Optional, Set
from typing_extensions import Self

class ModLessonGetUserAttempt200ResponseUserstatsGradeinfo(BaseModel):
    """
    ModLessonGetUserAttempt200ResponseUserstatsGradeinfo
    """ # noqa: E501
    attempts: StrictInt = Field(description="Number of question attempts")
    earned: Union[StrictFloat, StrictInt] = Field(description="Points earned by student")
    grade: Union[StrictFloat, StrictInt] = Field(description="Calculated percentage grade")
    manualpoints: Union[StrictFloat, StrictInt] = Field(description="Point value for manually graded questions")
    nmanual: StrictInt = Field(description="Number of manually graded questions")
    nquestions: StrictInt = Field(description="Number of questions answered")
    total: Union[StrictFloat, StrictInt] = Field(description="Max points possible")
    __properties: ClassVar[List[str]] = ["attempts", "earned", "grade", "manualpoints", "nmanual", "nquestions", "total"]

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
        """Create an instance of ModLessonGetUserAttempt200ResponseUserstatsGradeinfo from a JSON string"""
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
        """Create an instance of ModLessonGetUserAttempt200ResponseUserstatsGradeinfo from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "attempts": obj.get("attempts") if obj.get("attempts") is not None else null,
            "earned": obj.get("earned") if obj.get("earned") is not None else null,
            "grade": obj.get("grade") if obj.get("grade") is not None else null,
            "manualpoints": obj.get("manualpoints") if obj.get("manualpoints") is not None else null,
            "nmanual": obj.get("nmanual") if obj.get("nmanual") is not None else null,
            "nquestions": obj.get("nquestions") if obj.get("nquestions") is not None else null,
            "total": obj.get("total") if obj.get("total") is not None else null
        })
        return _obj

