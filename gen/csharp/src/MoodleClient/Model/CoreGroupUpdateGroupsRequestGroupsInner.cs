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
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// CoreGroupUpdateGroupsRequestGroupsInner
    /// </summary>
    [DataContract(Name = "core_group_update_groups_request_groups_inner")]
    public partial class CoreGroupUpdateGroupsRequestGroupsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreGroupUpdateGroupsRequestGroupsInner" /> class.
        /// </summary>
        /// <param name="customfields">customfields.</param>
        /// <param name="description">group description text.</param>
        /// <param name="descriptionformat">description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) (default to 1).</param>
        /// <param name="enrolmentkey">group enrol secret phrase.</param>
        /// <param name="id">ID of the group (default to null).</param>
        /// <param name="idnumber">id number.</param>
        /// <param name="name">multilang compatible name, course unique.</param>
        /// <param name="participation">activity participation enabled? Only for \&quot;all\&quot; and \&quot;members\&quot; visibility (default to null).</param>
        /// <param name="visibility">group visibility mode. 0 &#x3D; Visible to all. 1 &#x3D; Visible to members. 2 &#x3D; See own membership. 3 &#x3D; Membership is hidden. (default to &quot;null&quot;).</param>
        public CoreGroupUpdateGroupsRequestGroupsInner(List<CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner> customfields = default(List<CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner>), string description = default(string), int descriptionformat = 1, string enrolmentkey = default(string), int id = null, string idnumber = default(string), string name = default(string), bool participation = null, string visibility = @"null")
        {
            this.Customfields = customfields;
            this.Description = description;
            this.Descriptionformat = descriptionformat;
            this.Enrolmentkey = enrolmentkey;
            this.Id = id;
            this.Idnumber = idnumber;
            this.Name = name;
            this.Participation = participation;
            // use default value if no "visibility" provided
            this.Visibility = visibility ?? @"null";
        }

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
        /// ID of the group
        /// </summary>
        /// <value>ID of the group</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

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
        /// activity participation enabled? Only for \&quot;all\&quot; and \&quot;members\&quot; visibility
        /// </summary>
        /// <value>activity participation enabled? Only for \&quot;all\&quot; and \&quot;members\&quot; visibility</value>
        [DataMember(Name = "participation", EmitDefaultValue = true)]
        public bool Participation { get; set; }

        /// <summary>
        /// group visibility mode. 0 &#x3D; Visible to all. 1 &#x3D; Visible to members. 2 &#x3D; See own membership. 3 &#x3D; Membership is hidden.
        /// </summary>
        /// <value>group visibility mode. 0 &#x3D; Visible to all. 1 &#x3D; Visible to members. 2 &#x3D; See own membership. 3 &#x3D; Membership is hidden.</value>
        [DataMember(Name = "visibility", EmitDefaultValue = false)]
        public string Visibility { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreGroupUpdateGroupsRequestGroupsInner {\n");
            sb.Append("  Customfields: ").Append(Customfields).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Descriptionformat: ").Append(Descriptionformat).Append("\n");
            sb.Append("  Enrolmentkey: ").Append(Enrolmentkey).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
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
