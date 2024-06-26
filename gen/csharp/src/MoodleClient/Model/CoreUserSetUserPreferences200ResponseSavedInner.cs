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
    /// CoreUserSetUserPreferences200ResponseSavedInner
    /// </summary>
    [DataContract(Name = "core_user_set_user_preferences_200_response_saved_inner")]
    public partial class CoreUserSetUserPreferences200ResponseSavedInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreUserSetUserPreferences200ResponseSavedInner" /> class.
        /// </summary>
        /// <param name="name">The name of the preference.</param>
        /// <param name="userid">The user the preference was set for (default to null).</param>
        public CoreUserSetUserPreferences200ResponseSavedInner(string name = default(string), int userid = null)
        {
            this.Name = name;
            this.Userid = userid;
        }

        /// <summary>
        /// The name of the preference
        /// </summary>
        /// <value>The name of the preference</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// The user the preference was set for
        /// </summary>
        /// <value>The user the preference was set for</value>
        [DataMember(Name = "userid", EmitDefaultValue = false)]
        public int Userid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreUserSetUserPreferences200ResponseSavedInner {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
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
