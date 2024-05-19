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
    /// ModAssignSetUserFlagsRequest
    /// </summary>
    [DataContract(Name = "mod_assign_set_user_flags_request")]
    public partial class ModAssignSetUserFlagsRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModAssignSetUserFlagsRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModAssignSetUserFlagsRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModAssignSetUserFlagsRequest" /> class.
        /// </summary>
        /// <param name="assignmentid">assignment id (required).</param>
        /// <param name="userflags">userflags (required).</param>
        public ModAssignSetUserFlagsRequest(int assignmentid = default(int), List<ModAssignSetUserFlagsRequestUserflagsInner> userflags = default(List<ModAssignSetUserFlagsRequestUserflagsInner>))
        {
            this.Assignmentid = assignmentid;
            // to ensure "userflags" is required (not null)
            if (userflags == null)
            {
                throw new ArgumentNullException("userflags is a required property for ModAssignSetUserFlagsRequest and cannot be null");
            }
            this.Userflags = userflags;
        }

        /// <summary>
        /// assignment id
        /// </summary>
        /// <value>assignment id</value>
        [DataMember(Name = "assignmentid", IsRequired = true, EmitDefaultValue = true)]
        public int Assignmentid { get; set; }

        /// <summary>
        /// Gets or Sets Userflags
        /// </summary>
        [DataMember(Name = "userflags", IsRequired = true, EmitDefaultValue = true)]
        public List<ModAssignSetUserFlagsRequestUserflagsInner> Userflags { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModAssignSetUserFlagsRequest {\n");
            sb.Append("  Assignmentid: ").Append(Assignmentid).Append("\n");
            sb.Append("  Userflags: ").Append(Userflags).Append("\n");
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
