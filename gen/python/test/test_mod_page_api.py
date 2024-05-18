# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.api.mod_page_api import ModPageApi


class TestModPageApi(unittest.TestCase):
    """ModPageApi unit test stubs"""

    def setUp(self) -> None:
        self.api = ModPageApi()

    def tearDown(self) -> None:
        pass

    def test_mod_page_get_pages_by_courses(self) -> None:
        """Test case for mod_page_get_pages_by_courses

        Returns a list of pages in a provided list of courses, if no list is provided all pages that the user                             can view will be returned.
        """
        pass

    def test_mod_page_view_page(self) -> None:
        """Test case for mod_page_view_page

        Simulate the view.php web interface page: trigger events, completion, etc...
        """
        pass


if __name__ == '__main__':
    unittest.main()