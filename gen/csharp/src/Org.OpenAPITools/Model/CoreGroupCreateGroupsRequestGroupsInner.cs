/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// CoreGroupCreateGroupsRequestGroupsInner
    /// </summary>
    [DataContract(Name = "core_group_create_groups_request_groups_inner")]
    public partial class CoreGroupCreateGroupsRequestGroupsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreGroupCreateGroupsRequestGroupsInner" /> class.
        /// </summary>
        /// <param name="courseid">id of course.</param>
        /// <param name="customfields">customfields.</param>
        /// <param name="description">group description text (default to &quot;null&quot;).</param>
        /// <param name="descriptionformat">description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) (default to 1).</param>
        /// <param name="enrolmentkey">group enrol secret phrase (default to &quot;null&quot;).</param>
        /// <param name="idnumber">id number.</param>
        /// <param name="name">multilang compatible name, course unique.</param>
        /// <param name="participation">activity participation enabled? Only for \&quot;all\&quot; and \&quot;members\&quot; visibility. Default true. (default to true).</param>
        /// <param name="visibility">group visibility mode. 0 &#x3D; Visible to all. 1 &#x3D; Visible to members. 2 &#x3D; See own membership. 3 &#x3D; Membership is hidden. default: 0 (default to 0).</param>
        public CoreGroupCreateGroupsRequestGroupsInner(int courseid = default(int), List<CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner> customfields = default(List<CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner>), string description = @"null", int descriptionformat = 1, string enrolmentkey = @"null", string idnumber = default(string), string name = default(string), bool participation = true, int visibility = 0)
        {
            this.Courseid = courseid;
            this.Customfields = customfields;
            // use default value if no "description" provided
            this.Description = description ?? @"null";
            this.Descriptionformat = descriptionformat;
            // use default value if no "enrolmentkey" provided
            this.Enrolmentkey = enrolmentkey ?? @"null";
            this.Idnumber = idnumber;
            this.Name = name;
            this.Participation = participation;
            this.Visibility = visibility;
        }

        /// <summary>
        /// id of course
        /// </summary>
        /// <value>id of course</value>
        [DataMember(Name = "courseid", EmitDefaultValue = false)]
        public int Courseid { get; set; }

        /// <summary>
        /// Gets or Sets Customfields
        /// </summary>
        [DataMember(Name = "customfields", EmitDefaultValue = false)]
        public List<CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner> Customfields { get; set; }

        /// <summary>
        /// group description text
        /// </summary>
        /// <value>group description text</value>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
        /// </summary>
        /// <value>description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)</value>
        [DataMember(Name = "descriptionformat", EmitDefaultValue = false)]
        public int Descriptionformat { get; set; }

        /// <summary>
        /// group enrol secret phrase
        /// </summary>
        /// <value>group enrol secret phrase</value>
        [DataMember(Name = "enrolmentkey", EmitDefaultValue = false)]
        public string Enrolmentkey { get; set; }

        /// <summary>
        /// id number
        /// </summary>
        /// <value>id number</value>
        [DataMember(Name = "idnumber", EmitDefaultValue = false)]
        public string Idnumber { get; set; }

        /// <summary>
        /// multilang compatible name, course unique
        /// </summary>
        /// <value>multilang compatible name, course unique</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// activity participation enabled? Only for \&quot;all\&quot; and \&quot;members\&quot; visibility. Default true.
        /// </summary>
        /// <value>activity participation enabled? Only for \&quot;all\&quot; and \&quot;members\&quot; visibility. Default true.</value>
        [DataMember(Name = "participation", EmitDefaultValue = true)]
        public bool Participation { get; set; }

        /// <summary>
        /// group visibility mode. 0 &#x3D; Visible to all. 1 &#x3D; Visible to members. 2 &#x3D; See own membership. 3 &#x3D; Membership is hidden. default: 0
        /// </summary>
        /// <value>group visibility mode. 0 &#x3D; Visible to all. 1 &#x3D; Visible to members. 2 &#x3D; See own membership. 3 &#x3D; Membership is hidden. default: 0</value>
        [DataMember(Name = "visibility", EmitDefaultValue = false)]
        public int Visibility { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreGroupCreateGroupsRequestGroupsInner {\n");
            sb.Append("  Courseid: ").Append(Courseid).Append("\n");
            sb.Append("  Customfields: ").Append(Customfields).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Descriptionformat: ").Append(Descriptionformat).Append("\n");
            sb.Append("  Enrolmentkey: ").Append(Enrolmentkey).Append("\n");
            sb.Append("  Idnumber: ").Append(Idnumber).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Participation: ").Append(Participation).Append("\n");
            sb.Append("  Visibility: ").Append(Visibility).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}