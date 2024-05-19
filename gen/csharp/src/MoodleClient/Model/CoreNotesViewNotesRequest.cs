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
    /// CoreNotesViewNotesRequest
    /// </summary>
    [DataContract(Name = "core_notes_view_notes_request")]
    public partial class CoreNotesViewNotesRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreNotesViewNotesRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreNotesViewNotesRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreNotesViewNotesRequest" /> class.
        /// </summary>
        /// <param name="courseid">course id, 0 for notes at system level (required) (default to null).</param>
        /// <param name="userid">user id, 0 means view all the user notes (default to 0).</param>
        public CoreNotesViewNotesRequest(int courseid = null, int userid = 0)
        {
            this.Courseid = courseid;
            this.Userid = userid;
        }

        /// <summary>
        /// course id, 0 for notes at system level
        /// </summary>
        /// <value>course id, 0 for notes at system level</value>
        [DataMember(Name = "courseid", IsRequired = true, EmitDefaultValue = true)]
        public int Courseid { get; set; }

        /// <summary>
        /// user id, 0 means view all the user notes
        /// </summary>
        /// <value>user id, 0 means view all the user notes</value>
        [DataMember(Name = "userid", EmitDefaultValue = false)]
        public int Userid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreNotesViewNotesRequest {\n");
            sb.Append("  Courseid: ").Append(Courseid).Append("\n");
            sb.Append("  Userid: ").Append(Userid).Append("\n");
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
