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

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictFloat, StrictInt
from typing import Any, ClassVar, Dict, List, Optional, Union
from openapi_client.models.mod_lesson_get_attempts_overview200_response_data_students_inner import ModLessonGetAttemptsOverview200ResponseDataStudentsInner
from typing import Optional, Set
from typing_extensions import Self

class ModLessonGetAttemptsOverview200ResponseData(BaseModel):
    """
    ModLessonGetAttemptsOverview200ResponseData
    """ # noqa: E501
    avescore: Union[StrictFloat, StrictInt] = Field(description="Average score.")
    avetime: StrictInt = Field(description="Average time (spent in taking the lesson).")
    highscore: Union[StrictFloat, StrictInt] = Field(description="High score.")
    hightime: StrictInt = Field(description="High time.")
    lessonscored: StrictBool = Field(description="True if the lesson was scored.")
    lowscore: Union[StrictFloat, StrictInt] = Field(description="Low score.")
    lowtime: StrictInt = Field(description="Low time.")
    numofattempts: StrictInt = Field(description="Number of attempts.")
    students: Optional[List[ModLessonGetAttemptsOverview200ResponseDataStudentsInner]] = None
    __properties: ClassVar[List[str]] = ["avescore", "avetime", "highscore", "hightime", "lessonscored", "lowscore", "lowtime", "numofattempts", "students"]

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
        """Create an instance of ModLessonGetAttemptsOverview200ResponseData from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in students (list)
        _items = []
        if self.students:
            for _item in self.students:
                if _item:
                    _items.append(_item.to_dict())
            _dict['students'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ModLessonGetAttemptsOverview200ResponseData from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "avescore": obj.get("avescore") if obj.get("avescore") is not None else null,
            "avetime": obj.get("avetime") if obj.get("avetime") is not None else null,
            "highscore": obj.get("highscore") if obj.get("highscore") is not None else null,
            "hightime": obj.get("hightime") if obj.get("hightime") is not None else null,
            "lessonscored": obj.get("lessonscored") if obj.get("lessonscored") is not None else False,
            "lowscore": obj.get("lowscore") if obj.get("lowscore") is not None else null,
            "lowtime": obj.get("lowtime") if obj.get("lowtime") is not None else null,
            "numofattempts": obj.get("numofattempts") if obj.get("numofattempts") is not None else null,
            "students": [ModLessonGetAttemptsOverview200ResponseDataStudentsInner.from_dict(_item) for _item in obj["students"]] if obj.get("students") is not None else None
        })
        return _obj

