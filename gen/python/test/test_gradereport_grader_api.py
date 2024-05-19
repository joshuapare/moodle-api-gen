# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.api.gradereport_grader_api import GradereportGraderApi


class TestGradereportGraderApi(unittest.TestCase):
    """GradereportGraderApi unit test stubs"""

    def setUp(self) -> None:
        self.api = GradereportGraderApi()

    def tearDown(self) -> None:
        pass

    def test_gradereport_grader_get_users_in_report(self) -> None:
        """Test case for gradereport_grader_get_users_in_report

        Returns the dataset of users within the report
        """
        pass


if __name__ == '__main__':
    unittest.main()
