# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.api.gradereport_singleview_api import GradereportSingleviewApi


class TestGradereportSingleviewApi(unittest.TestCase):
    """GradereportSingleviewApi unit test stubs"""

    def setUp(self) -> None:
        self.api = GradereportSingleviewApi()

    def tearDown(self) -> None:
        pass

    def test_gradereport_singleview_get_grade_items_for_search_widget(self) -> None:
        """Test case for gradereport_singleview_get_grade_items_for_search_widget

        Get the gradeitem/(s) for a course
        """
        pass


if __name__ == '__main__':
    unittest.main()
