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
    /// CoreGradesGetGroupsForSelector200ResponseGroupsInner
    /// </summary>
    [DataContract(Name = "core_grades_get_groups_for_selector_200_response_groups_inner")]
    public partial class CoreGradesGetGroupsForSelector200ResponseGroupsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreGradesGetGroupsForSelector200ResponseGroupsInner" /> class.
        /// </summary>
        /// <param name="groupimageurl">Group image URL.</param>
        /// <param name="id">An ID for the group.</param>
        /// <param name="name">The full name of the group.</param>
        public CoreGradesGetGroupsForSelector200ResponseGroupsInner(string groupimageurl = default(string), string id = default(string), string name = default(string))
        {
            this.Groupimageurl = groupimageurl;
            this.Id = id;
            this.Name = name;
        }

        /// <summary>
        /// Group image URL
        /// </summary>
        /// <value>Group image URL</value>
        [DataMember(Name = "groupimageurl", EmitDefaultValue = false)]
        public string Groupimageurl { get; set; }

        /// <summary>
        /// An ID for the group
        /// </summary>
        /// <value>An ID for the group</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// The full name of the group
        /// </summary>
        /// <value>The full name of the group</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreGradesGetGroupsForSelector200ResponseGroupsInner {\n");
            sb.Append("  Groupimageurl: ").Append(Groupimageurl).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
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
