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
    /// ModGlossaryGetEntryById200ResponsePermissions
    /// </summary>
    [DataContract(Name = "mod_glossary_get_entry_by_id_200_response_permissions")]
    public partial class ModGlossaryGetEntryById200ResponsePermissions : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModGlossaryGetEntryById200ResponsePermissions" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModGlossaryGetEntryById200ResponsePermissions() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModGlossaryGetEntryById200ResponsePermissions" /> class.
        /// </summary>
        /// <param name="candelete">Whether the user can delete the entry. (required) (default to null).</param>
        /// <param name="canupdate">Whether the user can update the entry. (required) (default to null).</param>
        public ModGlossaryGetEntryById200ResponsePermissions(bool candelete = null, bool canupdate = null)
        {
            this.Candelete = candelete;
            this.Canupdate = canupdate;
        }

        /// <summary>
        /// Whether the user can delete the entry.
        /// </summary>
        /// <value>Whether the user can delete the entry.</value>
        [DataMember(Name = "candelete", IsRequired = true, EmitDefaultValue = true)]
        public bool Candelete { get; set; }

        /// <summary>
        /// Whether the user can update the entry.
        /// </summary>
        /// <value>Whether the user can update the entry.</value>
        [DataMember(Name = "canupdate", IsRequired = true, EmitDefaultValue = true)]
        public bool Canupdate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModGlossaryGetEntryById200ResponsePermissions {\n");
            sb.Append("  Candelete: ").Append(Candelete).Append("\n");
            sb.Append("  Canupdate: ").Append(Canupdate).Append("\n");
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
