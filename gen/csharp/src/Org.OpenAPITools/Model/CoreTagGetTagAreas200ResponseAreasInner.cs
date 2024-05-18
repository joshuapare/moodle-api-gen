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
    /// CoreTagGetTagAreas200ResponseAreasInner
    /// </summary>
    [DataContract(Name = "core_tag_get_tag_areas_200_response_areas_inner")]
    public partial class CoreTagGetTagAreas200ResponseAreasInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreTagGetTagAreas200ResponseAreasInner" /> class.
        /// </summary>
        /// <param name="callback">Component callback for processing tags. (default to &quot;null&quot;).</param>
        /// <param name="callbackfile">Component callback file. (default to &quot;null&quot;).</param>
        /// <param name="component">Component the area is related to. (default to &quot;null&quot;).</param>
        /// <param name="enabled">Whether this area is enabled. (default to true).</param>
        /// <param name="id">Area id. (default to null).</param>
        /// <param name="itemtype">Type of item in the component. (default to &quot;null&quot;).</param>
        /// <param name="locked">Whether the area is locked. (default to false).</param>
        /// <param name="multiplecontexts">Whether the tag area allows tag instances to be created in multiple contexts.  (default to false).</param>
        /// <param name="showstandard">Return whether to display only standard, only non-standard or both tags. (default to 0).</param>
        /// <param name="tagcollid">The tag collection this are belongs to. (default to null).</param>
        public CoreTagGetTagAreas200ResponseAreasInner(string callback = @"null", string callbackfile = @"null", string component = @"null", bool enabled = true, int id = null, string itemtype = @"null", bool locked = false, bool multiplecontexts = false, int showstandard = 0, int tagcollid = null)
        {
            // use default value if no "callback" provided
            this.Callback = callback ?? @"null";
            // use default value if no "callbackfile" provided
            this.Callbackfile = callbackfile ?? @"null";
            // use default value if no "component" provided
            this.Component = component ?? @"null";
            this.Enabled = enabled;
            this.Id = id;
            // use default value if no "itemtype" provided
            this.Itemtype = itemtype ?? @"null";
            this.Locked = locked;
            this.Multiplecontexts = multiplecontexts;
            this.Showstandard = showstandard;
            this.Tagcollid = tagcollid;
        }

        /// <summary>
        /// Component callback for processing tags.
        /// </summary>
        /// <value>Component callback for processing tags.</value>
        [DataMember(Name = "callback", EmitDefaultValue = false)]
        public string Callback { get; set; }

        /// <summary>
        /// Component callback file.
        /// </summary>
        /// <value>Component callback file.</value>
        [DataMember(Name = "callbackfile", EmitDefaultValue = false)]
        public string Callbackfile { get; set; }

        /// <summary>
        /// Component the area is related to.
        /// </summary>
        /// <value>Component the area is related to.</value>
        [DataMember(Name = "component", EmitDefaultValue = false)]
        public string Component { get; set; }

        /// <summary>
        /// Whether this area is enabled.
        /// </summary>
        /// <value>Whether this area is enabled.</value>
        [DataMember(Name = "enabled", EmitDefaultValue = true)]
        public bool Enabled { get; set; }

        /// <summary>
        /// Area id.
        /// </summary>
        /// <value>Area id.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// Type of item in the component.
        /// </summary>
        /// <value>Type of item in the component.</value>
        [DataMember(Name = "itemtype", EmitDefaultValue = false)]
        public string Itemtype { get; set; }

        /// <summary>
        /// Whether the area is locked.
        /// </summary>
        /// <value>Whether the area is locked.</value>
        [DataMember(Name = "locked", EmitDefaultValue = true)]
        public bool Locked { get; set; }

        /// <summary>
        /// Whether the tag area allows tag instances to be created in multiple contexts. 
        /// </summary>
        /// <value>Whether the tag area allows tag instances to be created in multiple contexts. </value>
        [DataMember(Name = "multiplecontexts", EmitDefaultValue = true)]
        public bool Multiplecontexts { get; set; }

        /// <summary>
        /// Return whether to display only standard, only non-standard or both tags.
        /// </summary>
        /// <value>Return whether to display only standard, only non-standard or both tags.</value>
        [DataMember(Name = "showstandard", EmitDefaultValue = false)]
        public int Showstandard { get; set; }

        /// <summary>
        /// The tag collection this are belongs to.
        /// </summary>
        /// <value>The tag collection this are belongs to.</value>
        [DataMember(Name = "tagcollid", EmitDefaultValue = false)]
        public int Tagcollid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreTagGetTagAreas200ResponseAreasInner {\n");
            sb.Append("  Callback: ").Append(Callback).Append("\n");
            sb.Append("  Callbackfile: ").Append(Callbackfile).Append("\n");
            sb.Append("  Component: ").Append(Component).Append("\n");
            sb.Append("  Enabled: ").Append(Enabled).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Itemtype: ").Append(Itemtype).Append("\n");
            sb.Append("  Locked: ").Append(Locked).Append("\n");
            sb.Append("  Multiplecontexts: ").Append(Multiplecontexts).Append("\n");
            sb.Append("  Showstandard: ").Append(Showstandard).Append("\n");
            sb.Append("  Tagcollid: ").Append(Tagcollid).Append("\n");
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
